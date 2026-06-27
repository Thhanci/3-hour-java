package l18;

import org.junit.jupiter.api.Test;   // ✅ JUnit 5 的 Test
import static org.junit.jupiter.api.Assertions.*;   // ✅ JUnit 5 的断言

class StudentTest {

    @Test
    void getName() {
        Student s = new Student("张三", 90);
        String name = s.getName();
        assertEquals("张三", name);   // ✅ 来自 JUnit 5
    }

    @Test
    void setName() {
        Student s = new Student("张三", 90);
        s.setName("李四");
        assertEquals("李四", s.getName());
    }

    @Test
    void getScore() {
        Student s = new Student("张三", 90);
        assertEquals(135.0, s.getScore());
    }

    @Test
    void testEquals() {
        Student s1 = new Student("张三", 90);
        Student s2 = new Student("张三", 90);
        assertTrue(s1.equals(s2));
    }

    @Test
    void testToString() {
        Student s = new Student("张三", 90);
        String expected = "Student{name='张三', score=90.0}";
        assertEquals(expected, s.toString());
    }
}

/*

    ============================================================
    Java 注解 & 包命名规范
    ============================================================

    【@org 是什么】

    @org 本身不是标准写法。

    常见形式：@org.junit.Test（注解的完整限定名）
    表示"这个注解来自 org 这个包"。


    【org 全称】

    org = Organization（组织）

    在 Java 包命名中，org 是顶级域名倒置的一部分，
    常用于开源组织的项目。


    【常见 org 包】

    包名                        所属组织
    ────────────────────────────────────────────────────
    org.junit.*                JUnit 测试框架
    org.springframework.*      Spring 框架
    org.apache.*               Apache 软件基金会
    org.hibernate.*            Hibernate 框架


    【完整限定名 vs 导入简写】

    // 完整限定名（不推荐，太啰嗦）
    public class Test {
        @org.junit.Test
        public void testMethod() { ... }
    }

    // 导入简写（推荐）
    import org.junit.Test;   // 导入

    public class Test {
        @Test                // 简写，不用再写 org.junit
        public void testMethod() { ... }
    }


    【Java 包命名规则】

    以域名倒序开头，防止命名冲突。

    域名              →  包名
    ────────────────────────────────────────────────────
    org.apache.com    →  org.apache.com
    junit.org         →  org.junit
    google.com        →  com.google
    example.com       →  com.example


    【一句话总结】

    org 是 Organization 的缩写，在包名中表示代码来自某个组织。
    @org.junit.Test 是注解的完整写法，通常用 import 导入后简写为 @Test。

    ============================================================

*/

/*

    ============================================================
    封装（Encapsulation）
    ============================================================

    【基本概念】

    隐藏部分属性和实现细节，仅对外开放访问入口。

    【意义与价值】

    - 代码保护（安全性）；
    - 易于维护（可维护性）。

    ============================================================

*/