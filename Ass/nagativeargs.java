class CustomException extends Exception {
    CustomException(String s) {
        super(s);
    }
}

public class nagativeargs {
    public static void main(String[] args) {
        System.out.println("Command Line All Arguments : ");
        try {
            for (int i = 0; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < 0)
                    throw new CustomException("Negative Value Not Allowed");
                else
                    System.out.print(args[i] + " ");
            }
        } catch (CustomException e) {
            System.out.println("\nError : " + e.getMessage());
           // e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("\nError : "+e.getMessage());
            e.printStackTrace();
        }
    }
}