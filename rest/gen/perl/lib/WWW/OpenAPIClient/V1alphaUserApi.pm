=begin comment

Stability.ai REST API

Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 

The version of the OpenAPI document: 0.1
Contact: info@stability.ai
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::V1alphaUserApi;

require 5.6.0;
use strict;
use warnings;
use utf8;
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# v1alpha_user_account
#
# account
#
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'v1alpha_user_account' } = {
        summary => 'account',
        params => $params,
        returns => 'AccountResponseBody',
        };
}
# @return AccountResponseBody
#
sub v1alpha_user_account {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/v1alpha/user/account';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(api_key_header_Authorization )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('AccountResponseBody', $response);
    return $_response_object;
}

#
# v1alpha_user_balance
#
# balance
#
# @param string $organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
{
    my $params = {
    'organization' => {
        data_type => 'string',
        description => 'Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'v1alpha_user_balance' } = {
        summary => 'balance',
        params => $params,
        returns => 'BalanceResponseBody',
        };
}
# @return BalanceResponseBody
#
sub v1alpha_user_balance {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/v1alpha/user/balance';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # header params
    if ( exists $args{'organization'}) {
        $header_params->{'Organization'} = $self->{api_client}->to_header_value($args{'organization'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(api_key_header_Authorization )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('BalanceResponseBody', $response);
    return $_response_object;
}

1;
