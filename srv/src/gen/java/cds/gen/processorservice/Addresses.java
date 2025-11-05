package cds.gen.processorservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Addresses")
@Generated("cds-maven-plugin")
public interface Addresses extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String CUSTOMER = "customer";

  String CUSTOMER_ID = "customer_ID";

  String CITY = "city";

  String POST_CODE = "postCode";

  String STREET_ADDRESS = "streetAddress";

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

  String getCity();

  void setCity(String city);

  String getPostCode();

  void setPostCode(String postCode);

  String getStreetAddress();

  void setStreetAddress(String streetAddress);

  Addresses_ ref();

  static Addresses create() {
    return Struct.create(Addresses.class);
  }

  static Addresses of(Map<String, Object> map) {
    return Struct.access(map).as(Addresses.class);
  }

  static Addresses create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(Addresses.class);
  }
}
