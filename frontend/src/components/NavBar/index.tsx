import ImgDsDark from '../../assets/ds_dark.svg';

const NavBar: React.FC = () => {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-me-4 mb-3 bg-light border-bottom shadow-sm">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <img src={ ImgDsDark } alt="DevSuperior" width="120" />
                </nav>
            </div>

        </div>
    );
}

export default NavBar;