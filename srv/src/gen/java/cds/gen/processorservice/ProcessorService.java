package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import com.sap.cds.services.draft.DraftService;
import javax.annotation.processing.Generated;

@Generated("cds-maven-plugin")
@CdsName(ProcessorService_.CDS_NAME)
public interface ProcessorService extends CqnService {
  interface Application extends ApplicationService, ProcessorService {
  }

  interface Remote extends RemoteService, ProcessorService {
  }

  interface Draft extends DraftService, ProcessorService {
  }
}
