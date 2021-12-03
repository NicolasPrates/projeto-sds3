import NavBar from "../../components/NavBar";
import DataTable from "../../components/DataTable";
import Footer from "../../components/Footer";

const Dashboard = () => {
  return (
    <>
      <NavBar/>
      <div className="container">
        <h1 className="text-primary py-3">TABELA DE ENTRADA/SAÍDA</h1>
        <div className="py-3">
          <h2 className="text-primary">
            Todas as informações
          </h2>
        </div>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default Dashboard;
