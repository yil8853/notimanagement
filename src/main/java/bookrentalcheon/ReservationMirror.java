package bookrentalcheon;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ReservationMirror_table")
public class ReservationMirror {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String userid;
        private String status;
        private Date timestamp;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public Date getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
            this.timestamp = timestamp;
        }

}
