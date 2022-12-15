##### Creational Design Pattern’lar incelenmelidir. Örneklerle anlatınız.
---

> Creational Design Pattern'lar, nesnelerin oluşturulmasına ilişkin tasarım kalıplarıdır. Bu tasarım kalıpları, nesnelerin oluşturulma sürecini kolaylaştırır ve bu sayede kod daha anlaşılır  olur ve kullanımı kolay hale gelir.

Creational Design Pattern'lar aşağıdaki gibi sınıflandırılabilir:
- Factory Method: Bu tasarım kalıbı, nesnelerin oluşturulma sürecini bir fabrika sınıfına devretmeyi sağlar. Böylece, nesnelerin oluşturulma süreci kapsüllenmiş olur ve daha anlaşılır hale gelir. Örnek olarak, bir kalem fabrikası sınıfında farklı türden kalemlerin oluşturulma işlemleri gerçekleştirilebilir.
- Abstract Factory: Bu tasarım kalıbı, birbirleriyle ilişkili veya birbirlerinden türeyen nesnelerin oluşturulmasını sağlar. Örnek olarak, bir otomobil üretimi sınıfında otomobillerin yanı sıra jantlar, lastikler gibi nesnelerin de oluşturulması sağlanabilir.
- Singleton: Bu tasarım kalıbı, bir sınıfın tek bir nesnesinin oluşturulmasını sağlar. Bu sayede, sınıfın tek bir nesnesi kullanılabilir ve bu nesne de bir kez oluşturulur. Örnek olarak, bir veritabanı bağlantısı sınıfında tek bir veritabanı bağlantısı nesnesi oluşturulabilir ve bu nesne her yerden erişilebilir.

Örnek olarak, aşağıdaki Factory Method tasarım kalıbı örneğini inceleyebiliriz:

```
public interface Shape {
  void draw();
}
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Çember çizildi.");
  }
}
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Kare çizildi.");
  }
}
public class Triangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Üçgen çizildi.");
  }
}
public class ShapeFactory {
  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
      return new Triangle();
    }
    return null;
  }
}
```

Bu kodda, Shape, Circle, Square ve Triangle sınıfları farklı şekilleri temsil eden nesnelerdir. ShapeFactory sınıfı ise bu nesnelerin oluşturulmasını sağlayan bir fabrika sınıfıdır. ShapeFactory sınıfında `getShape()` metodu bulunur ve bu metot bir shapeType parametresi alır. `getShape()` metodu, shapeType parametresine göre farklı nesneleri oluşturur ve bu nesneleri döndürür. Böylece, nesnelerin oluşturulma süreci kapsüllenmiş olur ve daha anlaşılır hale gelir.

Bu örnekte, Factory Method tasarım kalıbı kullanılmıştır. Bu tasarım kalıbı sayesinde nesnelerin oluşturulma işlemleri bir fabrika sınıfına devredilmiş ve kod daha anlaşılır hale getirilmiştir. Bu sayede, nesnelerin oluşturulma süreci kolayca değiştirilebilir ve sistem daha esnek hale gelir.

Ayrıca, Abstract Factory tasarım kalıbı örneğini aşağıdaki gibidir:

```
public interface Shape {
  void draw();
}
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Çember çizildi.");
  }
}
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Kare çizildi.");
  }
}
public class Triangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Üçgen çizildi.");
  }
}
public interface Color {
  void fill();
}
public class Red implements Color {
  @Override
  public void fill() {
    System.out.println("Kırmızı renk dolduruldu.");
  }
}
public class Green implements Color {
  @Override
  public void fill() {
    System.out.println("Yeşil renk dolduruldu.");
  }
}
public class Blue implements Color {
  @Override
  public void fill() {
    System.out.println("Mavi renk dolduruldu.");
  }
}
public abstract class AbstractFactory {
  abstract Shape getShape(String shapeType);
  abstract Color getColor(String colorType);
}
public class ShapeFactory extends AbstractFactory {
  @Override
  Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
      return new Triangle();
    }
    return null;
  }

  @Override
  Color getColor(String colorType) {
    return null;
  }
}
public class ColorFactory extends AbstractFactory {
  @Override
  Shape getShape(String shapeType) {
    return null;
  }
  @Override
  Color getColor(String colorType) {
    if (colorType == null) {
      return null;
    }
    if (colorType.equalsIgnoreCase("RED")) {
      return new Red();
    }
    else if (colorType.equalsIgnoreCase("GREEN")) {
        return new Green();
    } else if (colorType.equalsIgnoreCase("BLUE")) {
        return new Blue();
    }
    return null;
    }
}
```

Bu kodda, Shape, Circle, Square, Triangle, Color, Red, Green ve Blue sınıfları farklı şekilleri ve renkleri temsil eden nesnelerdir. AbstractFactory sınıfı ise bu nesnelerin oluşturulmasını sağlayan bir fabrika sınıfıdır. AbstractFactory sınıfında getShape() ve getColor() metotları bulunur ve bu metotlar bir shapeType veya colorType parametresi alır. getShape() ve getColor() metotları, bu parametrelere göre farklı nesneleri oluşturur ve bu nesneleri döndürür.

Bu örnekte, Abstract Factory tasarım kalıbı kullanılmıştır. Bu tasarım kalıbı sayesinde, birbirleriyle ilişkisi olan veya birbirlerinden türeyen nesnelerin oluşturulması sağlanmıştır. Örneğin, bir şekil oluşturulurken aynı zamanda bu şeklin içini dolduran bir renk de oluşturulabilir. Böylece, nesnelerin oluşturulma süreci daha anlaşılır hale gelir ve sistem daha esnek hale gelir.