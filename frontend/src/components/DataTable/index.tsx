import {useEffect, useState} from "react";
import {IncomingPage} from "../../types/incoming";
import axios from "axios";
import {BASE_URL} from "../../utils/requests";
import {formatLocalDate} from "../../utils/format";
import Pagination from "../pagination";

const DataTable = () => {

  const [activePage, setActivePage] = useState(0)
  const [page, setPage] = useState<IncomingPage>({
    first: true,
    last: true,
    number: 0,
    totalElements: 0,
    totalPages: 0
  });

  useEffect(()=> {
    axios.get(`${BASE_URL}/Incomings?page=${activePage}&size=20&sort=data,desc`)
      .then(response => {
        setPage(response.data);
      });
    }, [activePage]);

  const changePage = (index: number) => {
    setActivePage(index);
  }

  return (
    <>
      <Pagination page = {page} onPageChange={changePage}/>
      <div className="table-responsive">
        <table className="table table-striped table-sm">
          <thead>
          <tr>
            <th>Data</th>
            <th>Nome</th>
            <th>Valor Esperado</th>
            <th>Valor Real</th>
          </tr>
          </thead>
          <tbody>
            {page.value?.map(item => (
              <tr key={item.id}>
                <td>{formatLocalDate(item.data, "dd/MM/yyyy")}</td>
                <td>{item.name}</td>
                <td>{item.valor_esperado}</td>
                <td>{item.valor_real}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}

export default DataTable;
