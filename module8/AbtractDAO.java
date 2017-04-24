package module8;


import java.util.ArrayList;
import java.util.List;

public interface AbtractDAO<T> {

    List database = new ArrayList();

    T save(T some);
    void delete(T some);
    void deleteAll(List<T> someList);
    void saveAll(List<T> someList);
    List<T> getList();
    void daleteById(long id);
    T get(long id);

}
