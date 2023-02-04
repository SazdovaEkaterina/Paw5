package finki.paw5.model.relations;

import lombok.Data;

import java.io.Serializable;

@Data
public class DonorDonatesToOrganisationId implements Serializable {

    int userId;
    int organisationId;

}
