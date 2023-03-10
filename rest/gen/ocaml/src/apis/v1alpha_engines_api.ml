(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let v1alpha_engines_list_engines ?organization () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/v1alpha/engines/list" in
    let headers = Request.default_headers in
    let headers = Cohttp.Header.add headers "Authorization" Request.api_key in
    let headers = Request.maybe_add_header headers "Organization" (fun x -> x) organization in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap List_engines_response_body.of_yojson) resp body

