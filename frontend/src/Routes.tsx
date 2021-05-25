import { BrowserRouter, Switch, Route } from 'react-router-dom'; 
import Home from 'pages/Home';
import Dashboard from 'pages/Dashboard';

const Routes: React.FC = () => {
  return (
      <BrowserRouter>
        <Switch>
            <Route exact path="/" component={ Home }/>
            <Route exact path="/dashboard" component={ Dashboard }/>
        </Switch>
      </BrowserRouter>
  );
}

export default Routes;