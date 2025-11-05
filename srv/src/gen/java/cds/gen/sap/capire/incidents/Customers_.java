package cds.gen.sap.capire.incidents;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;
import javax.annotation.processing.Generated;

/**
 * Customers entitled to create support Incidents.
 */
@CdsName("sap.capire.incidents.Customers")
@Generated("cds-maven-plugin")
public interface Customers_ extends LinkedStructuredType<Customers, Customers_> {
  String ID = "ID";

  String CDS_NAME = "sap.capire.incidents.Customers";

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  @CdsName(ID)
  ElementRef<String> ID();

  ElementRef<String> firstName();

  ElementRef<String> lastName();

  ElementRef<String> name();

  ElementRef<String> email();

  ElementRef<String> phone();

  Incidents_ incidents();

  Incidents_ incidents(Function<Incidents_, CqnPredicate> filter);

  ElementRef<String> creditCardNo();

  Addresses_ addresses();

  Addresses_ addresses(Function<Addresses_, CqnPredicate> filter);
}
