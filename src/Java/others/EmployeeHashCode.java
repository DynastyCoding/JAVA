package Java.others;

import java.util.Objects;

public class EmployeeHashCode {

    static class EmployeeDefault {
        String name;
        int age;
        String country;

        EmployeeDefault(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }
    }

    static class Employee {
        String name;
        int age;
        String country;

        Employee(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, country);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Employee other)) return false;
            return age == other.age
                    && Objects.equals(name, other.name)
                    && Objects.equals(country, other.country);
        }

        @Override
        public String toString() {
            return "Employee{name='%s', age=%d, country='%s'}".formatted(name, age, country);
        }
    }


    public static void main(String[] args) {
        System.out.println("=== 步驟一： 預設hashCode (未Override)");
        EmployeeDefault ed1 = new EmployeeDefault("Alice", 30, "Taiwan");
        EmployeeDefault ed2 = new EmployeeDefault("Alice", 30, "Taiwan");
        System.out.println("ed1.hashcode()= " + ed1.hashCode());
        System.out.println("ed2.hashcode()= " + ed2.hashCode());
        System.out.println("兩個hashcode相同嗎?" + (ed1.hashCode() == ed2.hashCode()));
        //false:Object預設hashCode基於記憶體位址，不同物件結果不同

        System.out.println("\n=== 步驟二：Override hashCode (屬性相同 ➡ 相同hash) ===");
        Employee e1 = new Employee("Alice", 30, "Taiwan");
        Employee e2 = new Employee("Alice", 30, "Taiwan");
        System.out.println("e1.hashcode() = " + e1.hashCode());
        System.out.println("e2.hashcode() = " + e2.hashCode());
        System.out.println("兩個 hashCode 相同嗎？" + (e1.hashCode() == e2.hashCode()));
        // → true

        System.out.println("\n=== equals() 驗證 ===");
        System.out.println("emp1.equals(emp2) = " + e1.equals(e2));
        // → true（因為屬性相同）

        Employee emp3 = new Employee("Bob", 25, "Japan");
        System.out.println("emp1.equals(emp3) = " + e1.equals(emp3));
        // → false（屬性不同）
    }
}
