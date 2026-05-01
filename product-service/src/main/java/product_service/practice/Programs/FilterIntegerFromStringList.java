package product_service.practice.Programs;

import java.util.List;
import java.util.stream.Collectors;

public class FilterIntegerFromStringList {
    List<String> values;
    public FilterIntegerFromStringList(List<String> values) {
        this.values = values;
    }

    public List<String> filterValues() {
       return values.stream().filter(v-> {
          try {
              Integer.parseInt(v);
              return true;
          } catch (NumberFormatException e) {
              return false;
          }
        }).collect(Collectors.toList());
    }
}
