package KTVTKPM.Facade;

public class DAOFacade {
    BookDAO bookDAO;
    ClotherDAO clotherDAO;

    public DAOFacade() {
        this.bookDAO = new BookDAO();
        this.clotherDAO = new ClotherDAO();

    }

    public void intDatabase() {
        bookDAO.initConnect();
        bookDAO.getData();

        clotherDAO.initConnect();
        clotherDAO.getData();
    }
}
