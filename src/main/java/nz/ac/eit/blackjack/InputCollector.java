package nz.ac.eit.blackjack;

public class InputCollector
{
    /**
     *
     * @param input input string
     * @return true for any input string beginning with Y and false for any input string beginning with N (not case sensitive)
     * @throws InputNotYesOrNoException if the input string does not begin with Y or N
     */
    public boolean collectYesOrNo(String input) throws InputNotYesOrNoException
    {
        char choice;
        try
        {
            choice = input.toLowerCase().charAt(0); // takes the first character of the input string and converts it to lowercase
        }
        catch (StringIndexOutOfBoundsException e) // if the user enters an empty string
        {
            throw new InputNotYesOrNoException();
        }
        switch (choice)
        {
            case 'y':
                return true;
            case 'n':
                return false;
            default: // if the first character is not 'y' or 'n'
                throw new InputNotYesOrNoException(input);
        }
    }
}
