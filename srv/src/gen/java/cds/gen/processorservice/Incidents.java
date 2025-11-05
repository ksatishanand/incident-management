package cds.gen.processorservice;

import cds.gen.draft.DraftAdministrativeDataDraftMessage;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Incidents")
@Generated("cds-maven-plugin")
public interface Incidents extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String CUSTOMER = "customer";

  String CUSTOMER_ID = "customer_ID";

  String TITLE = "title";

  String URGENCY = "urgency";

  String URGENCY_CODE = "urgency_code";

  String STATUS = "status";

  String STATUS_CODE = "status_code";

  String CONVERSATION = "conversation";

  String IS_ACTIVE_ENTITY = "IsActiveEntity";

  String HAS_ACTIVE_ENTITY = "HasActiveEntity";

  String HAS_DRAFT_ENTITY = "HasDraftEntity";

  String DRAFT_ADMINISTRATIVE_DATA = "DraftAdministrativeData";

  String DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID = "DraftAdministrativeData_DraftUUID";

  String SIBLING_ENTITY = "SiblingEntity";

  String DRAFT_MESSAGES = "DraftMessages";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  String getCreatedBy();

  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  String getModifiedBy();

  void setModifiedBy(String modifiedBy);

  Customers getCustomer();

  void setCustomer(Map<String, ?> customer);

  @CdsName(CUSTOMER_ID)
  String getCustomerId();

  @CdsName(CUSTOMER_ID)
  void setCustomerId(String customerId);

  String getTitle();

  void setTitle(String title);

  Urgency getUrgency();

  void setUrgency(Map<String, ?> urgency);

  @CdsName(URGENCY_CODE)
  String getUrgencyCode();

  @CdsName(URGENCY_CODE)
  void setUrgencyCode(String urgencyCode);

  Status getStatus();

  void setStatus(Map<String, ?> status);

  @CdsName(STATUS_CODE)
  String getStatusCode();

  @CdsName(STATUS_CODE)
  void setStatusCode(String statusCode);

  List<Conversation> getConversation();

  void setConversation(List<Conversation> conversation);

  @CdsName(IS_ACTIVE_ENTITY)
  Boolean getIsActiveEntity();

  @CdsName(IS_ACTIVE_ENTITY)
  void setIsActiveEntity(Boolean isActiveEntity);

  @CdsName(HAS_ACTIVE_ENTITY)
  Boolean getHasActiveEntity();

  @CdsName(HAS_ACTIVE_ENTITY)
  void setHasActiveEntity(Boolean hasActiveEntity);

  @CdsName(HAS_DRAFT_ENTITY)
  Boolean getHasDraftEntity();

  @CdsName(HAS_DRAFT_ENTITY)
  void setHasDraftEntity(Boolean hasDraftEntity);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA)
  DraftAdministrativeData getDraftAdministrativeData();

  @CdsName(DRAFT_ADMINISTRATIVE_DATA)
  void setDraftAdministrativeData(Map<String, ?> draftAdministrativeData);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  String getDraftAdministrativeDataDraftUUID();

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  void setDraftAdministrativeDataDraftUUID(String draftAdministrativeDataDraftUUID);

  @CdsName(SIBLING_ENTITY)
  Incidents getSiblingEntity();

  @CdsName(SIBLING_ENTITY)
  void setSiblingEntity(Map<String, ?> siblingEntity);

  @CdsName(DRAFT_MESSAGES)
  Collection<DraftAdministrativeDataDraftMessage> getDraftMessages();

  @CdsName(DRAFT_MESSAGES)
  void setDraftMessages(Collection<DraftAdministrativeDataDraftMessage> draftMessages);

  Incidents_ ref();

  static Incidents create() {
    return Struct.create(Incidents.class);
  }

  static Incidents of(Map<String, Object> map) {
    return Struct.access(map).as(Incidents.class);
  }

  @CdsName("ProcessorService.Incidents.conversation")
  interface Conversation extends CdsData {
    String ID = "ID";

    String TIMESTAMP = "timestamp";

    String AUTHOR = "author";

    String MESSAGE = "message";

    @CdsName(ID)
    String getId();

    @CdsName(ID)
    void setId(String id);

    Instant getTimestamp();

    void setTimestamp(Instant timestamp);

    String getAuthor();

    void setAuthor(String author);

    String getMessage();

    void setMessage(String message);

    static Conversation create() {
      return Struct.create(Conversation.class);
    }

    static Conversation of(Map<String, Object> map) {
      return Struct.access(map).as(Conversation.class);
    }
  }
}
