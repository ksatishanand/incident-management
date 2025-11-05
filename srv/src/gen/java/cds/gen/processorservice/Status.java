package cds.gen.processorservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Status")
@Generated("cds-maven-plugin")
public interface Status extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String CRITICALITY = "criticality";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  Integer getCriticality();

  void setCriticality(Integer criticality);

  List<StatusTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  StatusTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Status_ ref();

  static Status create() {
    return Struct.create(Status.class);
  }

  static Status of(Map<String, Object> map) {
    return Struct.access(map).as(Status.class);
  }

  static Status create(String code) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(CODE, code);
    return Struct.access(keys).as(Status.class);
  }
}
