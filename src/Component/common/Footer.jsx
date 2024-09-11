const FooterComponent = () => {
    return (
        <footer>
            <span className="my-footer">
                ABC Restaurant | All Rights Reserved &copy; {new Date().getFullYear()}
            </span>
        </footer>
    );
};

export default FooterComponent;