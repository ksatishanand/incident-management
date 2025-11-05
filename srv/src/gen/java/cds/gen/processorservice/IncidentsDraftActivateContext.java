package cds.gen.processorservice;

import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

@EventName("draftActivate")
@Generated("cds-maven-plugin")
public interface IncidentsDraftActivateContext extends EventContext {
  String CDS_NAME = "draftActivate";

  @Override
  ProcessorService getService();

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static IncidentsDraftActivateContext create() {
    return EventContext.create(IncidentsDraftActivateContext.class, "ProcessorService.Incidents");
  }

  void setResult(Incidents result);

  Incidents getResult();

  static IncidentsDraftActivateContext create(String entityName) {
    return EventContext.create(IncidentsDraftActivateContext.class, entityName);
  }
}
