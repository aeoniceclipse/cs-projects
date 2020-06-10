fn main() {
    let mut s = String::from("Hello");

    s.push_str(" text");

    println!("{}", s);

    owner();

    returns();

    borrow();

    fn owner() {
        println!("owner");

        let a = String::from ("owner");

        takes(a);

        let b = 2;

        copies(b);
    }

    fn takes(a: String) {
        println!("{}", a);
    }

    fn copies(b: i8) {
        println!("{}", b);
    }

    fn returns() {
        println!("return");

        let a = gives(); // moves its return into a

        let b = String::from("return"); // b created

        let c = taketogive(b); // b moved and returned

    }

    fn gives() -> String {
        let a = String::from("owner");

        a
    }

    fn taketogive(c: String) -> String {
        c
    }

    fn borrow() {
        println!("borrow");

        let a = String::from("owner");

        let len = length(&a);

        println!("The length of {} is {}", a, len)
    }

    fn length(a: &String) -> usize {
        a.len()
    }
}
