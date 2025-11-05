package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("AdminService.Addresses")
@Generated("cds-maven-plugin")
public interface Addresses_ extends LinkedStructuredType<Addresses, Addresses_> {
  String ID = "ID";

  String CUSTOMER_ID = "customer_ID";

  String CDS_NAME = "AdminService.Addresses";

  @CdsName(ID)
  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  Customers_ customer();

  Customers_ customer(Function<Customers_, CqnPredicate> filter);

  @CdsName(CUSTOMER_ID)
  ElementRef<String> customer_ID();

  ElementRef<String> city();

  ElementRef<String> postCode();

  ElementRef<String> streetAddress();
}
