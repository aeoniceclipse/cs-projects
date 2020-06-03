const VALUE: u32 = 10;

fn main() {
    let mut x = 5;
    println!("The value of x is: {}", x);
    x = 6;
    println!("The value of x is: {}", x);

    let y = 5;
    let y = y + 1;
    let y = y + 2;
    println!("The value of y is: {}", y);
    
    fn secondary() {
        println!("The constant value is: {}", VALUE);
    }

    secondary();

    let x = x + 1;

    println!("{}", x);
}
