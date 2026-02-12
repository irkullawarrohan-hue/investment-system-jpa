import jakarta.persistence.*;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int investmentId;

    private String tickerSymbol;
    private String assetClass;

    public Investment() {}
}
