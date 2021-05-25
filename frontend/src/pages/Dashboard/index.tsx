import BarChart from 'components/BarChart';
import DonutChart from 'components/DonutChart';
import DataTable from 'components/DataTable';

const Dashboard: React.FC = () => {
    return (
        <div className="container">
            <h1 className="text-primary py-3">Dashboard de vendas</h1>
            <div className="row px-3">
                <div className="col-sm-6">
                    <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
                    <BarChart />
                </div>
                <div className="col-sm-6">
                    <h5 className="text-center text-secondary">Todas as vendas</h5>
                    <DonutChart />
                </div>
                <div className="text-primary py-3">
                    <h2>Todal</h2>
                </div>
            </div>
            <DataTable />
        </div>
    );
}

export default Dashboard;