(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    id: string;
    is_default: bool;
    name: string;
    role: string;
} [@@deriving yojson { strict = false }, show ];;

let create (id : string) (is_default : bool) (name : string) (role : string) : t = {
    id = id;
    is_default = is_default;
    name = name;
    role = role;
}

