import jakarta.persistence.*;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advisorId;

    private String firstName;
    private String lastName;
    private String email;

    public Advisor() {}
}
