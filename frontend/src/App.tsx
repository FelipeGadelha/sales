import DataTable from 'components/DataTable';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import Home from 'pages/Home';
import React from 'react';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1>Olá mundo</h1>
        <DataTable />
      </div>
      <Home />
      <Footer />
    </>
  );
}

export default App;
