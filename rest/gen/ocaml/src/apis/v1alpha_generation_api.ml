(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let v1alpha_generation_image_to_image ~engine_id ~accept ~init_image ~options ?organization () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/v1alpha/generation/{engine_id}/image-to-image" in
    let headers = Request.default_headers in
    let headers = Cohttp.Header.add headers "Authorization" Request.api_key in
    let headers = Request.add_header headers "Accept" Enums.show_accept accept in
    let headers = Request.maybe_add_header headers "Organization" (fun x -> x) organization in
    let uri = Request.replace_path_param uri "engine_id" (fun x -> x) engine_id in
    let body = Request.init_form_encoded_body () in
    let body = Request.add_form_encoded_body_param body "init_image" (fun x -> x) init_image in
    let body = Request.add_form_encoded_body_param body "options" .show options in
    let body = Request.finalize_form_encoded_body body in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.handle_unit_response resp

let v1alpha_generation_masking ~engine_id ~accept ~init_image ~options ?organization ?mask_image () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/v1alpha/generation/{engine_id}/image-to-image/masking" in
    let headers = Request.default_headers in
    let headers = Cohttp.Header.add headers "Authorization" Request.api_key in
    let headers = Request.add_header headers "Accept" Enums.show_accept accept in
    let headers = Request.maybe_add_header headers "Organization" (fun x -> x) organization in
    let uri = Request.replace_path_param uri "engine_id" (fun x -> x) engine_id in
    let body = Request.init_form_encoded_body () in
    let body = Request.add_form_encoded_body_param body "init_image" (fun x -> x) init_image in
    let body = Request.maybe_add_form_encoded_body_param body "mask_image" (fun x -> x) mask_image in
    let body = Request.add_form_encoded_body_param body "options" .show options in
    let body = Request.finalize_form_encoded_body body in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.handle_unit_response resp

let v1alpha_generation_text_to_image ~engine_id ~accept ~text_to_image_request_body_t ?organization () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/v1alpha/generation/{engine_id}/text-to-image" in
    let headers = Request.default_headers in
    let headers = Cohttp.Header.add headers "Authorization" Request.api_key in
    let headers = Request.add_header headers "Accept" Enums.show_accept accept in
    let headers = Request.maybe_add_header headers "Organization" (fun x -> x) organization in
    let uri = Request.replace_path_param uri "engine_id" (fun x -> x) engine_id in
    let body = Request.write_as_json_body Text_to_image_request_body.to_yojson text_to_image_request_body_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.handle_unit_response resp

