package reflection.homework1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        Class<?> cl = tc.getClass();
        Method[] methods = cl.getMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(Test.class)){
                Test test = method.getAnnotation(Test.class);
                try {
                    method.invoke(tc, test.a(), test.b());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
