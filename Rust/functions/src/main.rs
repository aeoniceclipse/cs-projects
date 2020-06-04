fn main() {
    println!("Main");

    secondary(2);

    tertiary();

    println!("{}", another());

    println!("{}", adding(another()));
}

fn secondary(y: u8) {
    println!("Secondary/{}", y);
}

fn tertiary() {
    let (x, y, z) = (1, 2, 3);

    println!("main is {}, secondary is {}, tertiary is {}", x, y, z);

//  let all = {
//      let temp = x + y;
//      temp + z
//  };

//  println!("{}", all);
}

fn another() -> u8 {
    4
}

fn adding(f: u8) -> u8 {
    f + 1
}