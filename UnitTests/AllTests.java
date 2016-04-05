import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ test_getListById.class, Test_getNewId.class, test_getToDo.class, test_updateToDo.class,
		ToDoTest.class })
public class AllTests {

}
