fn main() {
    let z = String::from("ten");

    let tup: (i8, u8, String) = (-10, 10, z);

    let (x, y, z) = tup;

    println!("The values of x, y, and z are: {}, {}, and {}", x, y, z);

//  tup.2 gives an error due to type
    println!("tup consists of {}, {}, and {}", tup.0, tup.1, z);

    let arr = [1, 10, 100, 1000, 10000, 100000];

    let rep = [1; 10];

    println!("First arr is {}", arr[0]);

    println!("First rep is {}", rep[0]);

    println!("{} {} {} {} {} {}", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);

    println!("{} {} {} {} {} {} {} {} {} {}", rep[0], rep[1], rep[2], rep[3], rep[4], rep[5], rep[6], rep[7], rep[8], rep[9]);
}
