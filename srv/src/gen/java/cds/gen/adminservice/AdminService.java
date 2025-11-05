package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import com.sap.cds.services.draft.DraftService;
import javax.annotation.processing.Generated;

@Generated("cds-maven-plugin")
@CdsName(AdminService_.CDS_NAME)
public interface AdminService extends CqnService {
  interface Application extends ApplicationService, AdminService {
  }

  interface Remote extends RemoteService, AdminService {
  }

  interface Draft extends DraftService, AdminService {
  }
}
