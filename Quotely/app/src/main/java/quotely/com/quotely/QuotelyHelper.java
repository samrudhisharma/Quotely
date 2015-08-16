package quotely.com.quotely;
public class QuotelyHelper{

    private String quote;
    private String personQuote;

    public QuotelyHelper(String mQuote, String mPersonQuote)
    {
        super();

    quote = mQuote;
    personQuote = mPersonQuote;
    }

    public String sendPerson()
    {
        return personQuote;
    }

    public String sendQuote()
    {
        return quote;
    }
}
