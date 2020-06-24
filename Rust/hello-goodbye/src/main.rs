// in progress, marked by error

use std::io;

fn main() {
    let mut names = String::new();
    
    io::stdin()
            .read_line(&mut names)
            .expect("Failed to read name");

    let mut iter = names.split_whitespace();
    // let mut one = String::new();
    // let mut two = String::new();

    let mut one = assert_eq!(Some(" "), iter.next());
    let mut two = assert_eq!(Some(" "), iter.next());

    assert_eq!(None, iter.next());

    println!("{} {}", one, two);

}
