package bookrentalcheon;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Blacklist_table")
public class Blacklist {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String userid;
    private String userstatus;

    @PrePersist
    public void onPrePersist(){
        Alarmed alarmed = new Alarmed();
        BeanUtils.copyProperties(this, alarmed);
        alarmed.publishAfterCommit();


    }


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
    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }




}
