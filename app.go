package main

import "fmt"

import "C"

//export Add
func Add(x, y int) int {
	fmt.Printf("+")
	return x + y
}
func main() {}
