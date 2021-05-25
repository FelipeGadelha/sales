import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Home from 'pages/Home';
import Dashboard from 'pages/Dashboard';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';

const Routes: React.FC = () => {
    return (
        <BrowserRouter>
            <NavBar />
            <Switch>
                <Route exact path="/" component={Home} />
                <Route exact path="/dashboard" component={Dashboard} />
            </Switch>
            <Footer />
        </BrowserRouter>
    );
}

export default Routes;