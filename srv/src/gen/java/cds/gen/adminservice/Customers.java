package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("AdminService.Customers")
@Generated("cds-maven-plugin")
public interface Customers extends CdsData {
  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String ID = "ID";

  String FIRST_NAME = "firstName";

  String LAST_NAME = "lastName";

  String NAME = "name";

  String EMAIL = "email";

  String PHONE = "phone";

  String INCIDENTS = "incidents";

  String CREDIT_CARD_NO = "creditCardNo";

  String ADDRESSES = "addresses";

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  String getCreatedBy();

  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  String getModifiedBy();

  void setModifiedBy(String modifiedBy);

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getFirstName();

  void setFirstName(String firstName);

  String getLastName();

  void setLastName(String lastName);

  String getName();

  void setName(String name);

  String getEmail();

  void setEmail(String email);

  String getPhone();

  void setPhone(String phone);

  List<Incidents> getIncidents();

  void setIncidents(List<? extends Map<String, ?>> incidents);

  String getCreditCardNo();

  void setCreditCardNo(String creditCardNo);

  List<Addresses> getAddresses();

  void setAddresses(List<? extends Map<String, ?>> addresses);

  Customers_ ref();

  static Customers create() {
    return Struct.create(Customers.class);
  }

  static Customers of(Map<String, Object> map) {
    return Struct.access(map).as(Customers.class);
  }

  static Customers create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(Customers.class);
  }
}
