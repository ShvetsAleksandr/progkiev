package reflection_homework2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        TextContainer tc = new TextContainer();
        Saver saver = new Saver();
        Class<?> cl = saver.getClass();
        Method[] methods = cl.getMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(Save.class)){
                Save save = method.getAnnotation(Save.class);
                try {
                    method.invoke(saver, save.path(), tc.getText());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
