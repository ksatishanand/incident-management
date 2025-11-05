package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

@EventName("draftPrepare")
@Generated("cds-maven-plugin")
public interface IncidentsDraftPrepareContext extends EventContext {
  String SIDE_EFFECTS_QUALIFIER = "SideEffectsQualifier";

  String CDS_NAME = "draftPrepare";

  @CdsName(SIDE_EFFECTS_QUALIFIER)
  String getSideEffectsQualifier();

  @CdsName(SIDE_EFFECTS_QUALIFIER)
  void setSideEffectsQualifier(String sideEffectsQualifier);

  @Override
  ProcessorService getService();

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static IncidentsDraftPrepareContext create() {
    return EventContext.create(IncidentsDraftPrepareContext.class, "ProcessorService.Incidents");
  }

  void setResult(Incidents result);

  Incidents getResult();

  static IncidentsDraftPrepareContext create(String entityName) {
    return EventContext.create(IncidentsDraftPrepareContext.class, entityName);
  }
}
