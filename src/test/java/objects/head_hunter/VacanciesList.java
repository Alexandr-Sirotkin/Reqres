package objects.head_hunter;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import lombok.Data;

@Data
public class VacanciesList {
  @Expose
  ArrayList<Vacancy> items;
}
