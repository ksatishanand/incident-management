package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

@EventName("draftEdit")
@Generated("cds-maven-plugin")
public interface IncidentsDraftEditContext extends EventContext {
  String PRESERVE_CHANGES = "PreserveChanges";

  String CDS_NAME = "draftEdit";

  @CdsName(PRESERVE_CHANGES)
  Boolean getPreserveChanges();

  @CdsName(PRESERVE_CHANGES)
  void setPreserveChanges(Boolean preserveChanges);

  @Override
  ProcessorService getService();

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static IncidentsDraftEditContext create() {
    return EventContext.create(IncidentsDraftEditContext.class, "ProcessorService.Incidents");
  }

  void setResult(Incidents result);

  Incidents getResult();

  static IncidentsDraftEditContext create(String entityName) {
    return EventContext.create(IncidentsDraftEditContext.class, entityName);
  }
}
