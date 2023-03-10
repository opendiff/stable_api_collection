(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    description: string;
    (* Unique identifier for the engine *)
    id: string;
    (* Name of the engine *)
    name: string;
    (* The type of content this engine produces *)
    _type: Enums.engine_type;
} [@@deriving yojson { strict = false }, show ];;

let create (description : string) (id : string) (name : string) (_type : Enums.engine_type) : t = {
    description = description;
    id = id;
    name = name;
    _type = _type;
}

