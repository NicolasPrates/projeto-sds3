import NavBar from "../../components/NavBar";
import Footer from "../../components/Footer";
import { Link } from "react-router-dom"

const Home = () => {
  return (
    <>
      <NavBar/>
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">CONTROLE DE FINANÇAS</h1>
          <p className="lead">Organizando aqui a nossa vida financeira s2</p>
          <hr/>
          <p>Essa aplicação tem o intuito de auxiliar na análise das nossas finanças.</p>
          <Link className="btn btn-primary btn-lg" to="/dashboard">
            Acessar
          </Link>
        </div>
      </div>
      <Footer/>
    </>
  );
}
export default Home;
