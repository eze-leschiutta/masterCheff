package javax.menu;

public class MenuFactory {
    public static Menu crear(String menuProvider) {
        try {
            return (Menu)Class.forName(menuProvider)
                    .newInstance();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
        }
    }
}
