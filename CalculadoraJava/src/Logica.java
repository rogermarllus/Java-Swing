public class Logica {
  public static String somar(int a, int b) throws Exception {
    try {
      return "" + (a + b);
    } catch (Exception ex) {
      throw ex;
    }
  }

  public static String sub(int a, int b) throws Exception {
    try {
      return "" + (a - b);
    } catch (Exception ex) {
      throw ex;
    }
  }

  public static String div(int a, int b) throws Exception {
    try {
      return "" + (a / b);
    } catch (Exception ex) {
      throw ex;
    }
  }

  public static String mul(int a, int b) throws Exception {
    try {
      return "" + (a * b);
    } catch (Exception ex) {
      throw ex;
    }
  }
}