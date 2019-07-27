package cd.featrue.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author lcb 2019/7/27
 */
@Data
@Table(name = "d_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1019758648663784742L;

    @Id
    private Long id;

    private String username;

    private LocalDateTime createdOn;
}
