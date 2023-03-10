# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: project.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import generation_pb2 as generation__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\rproject.proto\x12\x07gooseai\x1a\x10generation.proto\"\xee\x01\n\x0cProjectAsset\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x10\n\x03uri\x18\x02 \x01(\tR\x03uri\x12*\n\x03use\x18\x03 \x01(\x0e\x32\x18.gooseai.ProjectAssetUseR\x03use\x12\x12\n\x04name\x18\x04 \x01(\tR\x04name\x12\x12\n\x04size\x18\x05 \x01(\x04R\x04size\x12\x1d\n\ncreated_at\x18\x06 \x01(\x04R\tcreatedAt\x12\x1d\n\nupdated_at\x18\x07 \x01(\x04R\tupdatedAt\x12*\n\x07request\x18\x08 \x01(\x0b\x32\x10.gooseai.RequestR\x07request\"\xd6\x02\n\x07Project\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x14\n\x05title\x18\x02 \x01(\tR\x05title\x12\x19\n\x08owner_id\x18\x03 \x01(\tR\x07ownerId\x12.\n\x06\x61\x63\x63\x65ss\x18\x04 \x01(\x0e\x32\x16.gooseai.ProjectAccessR\x06\x61\x63\x63\x65ss\x12.\n\x06status\x18\x05 \x01(\x0e\x32\x16.gooseai.ProjectStatusR\x06status\x12\x12\n\x04size\x18\x06 \x01(\x04R\x04size\x12)\n\x04\x66ile\x18\x07 \x01(\x0b\x32\x15.gooseai.ProjectAssetR\x04\x66ile\x12\x1d\n\ncreated_at\x18\x08 \x01(\x04R\tcreatedAt\x12\x1d\n\nupdated_at\x18\t \x01(\x04R\tupdatedAt\x12-\n\x06\x61ssets\x18\n \x03(\x0b\x32\x15.gooseai.ProjectAssetR\x06\x61ssets\"\xf2\x01\n\x14\x43reateProjectRequest\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12\x1e\n\x08owner_id\x18\x02 \x01(\tH\x00R\x07ownerId\x88\x01\x01\x12.\n\x06\x61\x63\x63\x65ss\x18\x03 \x01(\x0e\x32\x16.gooseai.ProjectAccessR\x06\x61\x63\x63\x65ss\x12.\n\x06status\x18\x04 \x01(\x0e\x32\x16.gooseai.ProjectStatusR\x06status\x12.\n\x04\x66ile\x18\x05 \x01(\x0b\x32\x15.gooseai.ProjectAssetH\x01R\x04\x66ile\x88\x01\x01\x42\x0b\n\t_owner_idB\x07\n\x05_file\"\xb1\x02\n\x14UpdateProjectRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x1e\n\x08owner_id\x18\x02 \x01(\tH\x00R\x07ownerId\x88\x01\x01\x12\x19\n\x05title\x18\x03 \x01(\tH\x01R\x05title\x88\x01\x01\x12\x33\n\x06\x61\x63\x63\x65ss\x18\x04 \x01(\x0e\x32\x16.gooseai.ProjectAccessH\x02R\x06\x61\x63\x63\x65ss\x88\x01\x01\x12\x33\n\x06status\x18\x05 \x01(\x0e\x32\x16.gooseai.ProjectStatusH\x03R\x06status\x88\x01\x01\x12.\n\x04\x66ile\x18\x06 \x01(\x0b\x32\x15.gooseai.ProjectAssetH\x04R\x04\x66ile\x88\x01\x01\x42\x0b\n\t_owner_idB\x08\n\x06_titleB\t\n\x07_accessB\t\n\x07_statusB\x07\n\x05_file\"A\n\x12ListProjectRequest\x12\x1e\n\x08owner_id\x18\x01 \x01(\tH\x00R\x07ownerId\x88\x01\x01\x42\x0b\n\t_owner_id\"P\n\x11GetProjectRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x1e\n\x08owner_id\x18\x02 \x01(\tH\x00R\x07ownerId\x88\x01\x01\x42\x0b\n\t_owner_id\"S\n\x14\x44\x65leteProjectRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x1e\n\x08owner_id\x18\x02 \x01(\tH\x00R\x07ownerId\x88\x01\x01\x42\x0b\n\t_owner_id\"\xd0\x02\n\x12QueryAssetsRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x1e\n\x08owner_id\x18\x02 \x01(\tH\x00R\x07ownerId\x88\x01\x01\x12\x19\n\x05since\x18\x03 \x01(\x04H\x01R\x05since\x88\x01\x01\x12\x19\n\x05until\x18\x04 \x01(\x04H\x02R\x05until\x88\x01\x01\x12\x19\n\x05limit\x18\x05 \x01(\x04H\x03R\x05limit\x88\x01\x01\x12 \n\tstart_key\x18\x06 \x01(\tH\x04R\x08startKey\x88\x01\x01\x12*\n\x03use\x18\x07 \x03(\x0e\x32\x18.gooseai.ProjectAssetUseR\x03use\x12\x32\n\x08sort_dir\x18\x08 \x01(\x0e\x32\x17.gooseai.ProjectSortDirR\x07sortDirB\x0b\n\t_owner_idB\x08\n\x06_sinceB\x08\n\x06_untilB\x08\n\x06_limitB\x0c\n\n_start_key\"q\n\x13QueryAssetsResponse\x12-\n\x06\x61ssets\x18\x01 \x03(\x0b\x32\x15.gooseai.ProjectAssetR\x06\x61ssets\x12\x1e\n\x08last_key\x18\x02 \x01(\tH\x00R\x07lastKey\x88\x01\x01\x42\x0b\n\t_last_key*F\n\rProjectAccess\x12\x1a\n\x16PROJECT_ACCESS_PRIVATE\x10\x00\x12\x19\n\x15PROJECT_ACCESS_PUBLIC\x10\x01*c\n\rProjectStatus\x12\x1b\n\x17PROJECT_STATUS_INACTIVE\x10\x00\x12\x19\n\x15PROJECT_STATUS_ACTIVE\x10\x01\x12\x1a\n\x16PROJECT_STATUS_DELETED\x10\x02*\xb0\x01\n\x0fProjectAssetUse\x12\x1f\n\x1bPROJECT_ASSET_USE_UNDEFINED\x10\x00\x12\x1b\n\x17PROJECT_ASSET_USE_INPUT\x10\x01\x12\x1c\n\x18PROJECT_ASSET_USE_OUTPUT\x10\x02\x12\"\n\x1ePROJECT_ASSET_USE_INTERMEDIATE\x10\x03\x12\x1d\n\x19PROJECT_ASSET_USE_PROJECT\x10\x04*g\n\x0eProjectSortDir\x12 \n\x1cPROJECT_SORT_DIR_UNSPECIFIED\x10\x00\x12\x18\n\x14PROJECT_SORT_DIR_ASC\x10\x01\x12\x19\n\x15PROJECT_SORT_DIR_DESC\x10\x02\x32\x85\x03\n\x0eProjectService\x12;\n\x06\x43reate\x12\x1d.gooseai.CreateProjectRequest\x1a\x10.gooseai.Project\"\x00\x12;\n\x06Update\x12\x1d.gooseai.UpdateProjectRequest\x1a\x10.gooseai.Project\"\x00\x12\x39\n\x04List\x12\x1b.gooseai.ListProjectRequest\x1a\x10.gooseai.Project\"\x00\x30\x01\x12\x35\n\x03Get\x12\x1a.gooseai.GetProjectRequest\x1a\x10.gooseai.Project\"\x00\x12;\n\x06\x44\x65lete\x12\x1d.gooseai.DeleteProjectRequest\x1a\x10.gooseai.Project\"\x00\x12J\n\x0bQueryAssets\x12\x1b.gooseai.QueryAssetsRequest\x1a\x1c.gooseai.QueryAssetsResponse\"\x00\x42\x38Z6github.com/stability-ai/api-interfaces/gooseai/projectb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'project_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z6github.com/stability-ai/api-interfaces/gooseai/project'
  _PROJECTACCESS._serialized_start=1871
  _PROJECTACCESS._serialized_end=1941
  _PROJECTSTATUS._serialized_start=1943
  _PROJECTSTATUS._serialized_end=2042
  _PROJECTASSETUSE._serialized_start=2045
  _PROJECTASSETUSE._serialized_end=2221
  _PROJECTSORTDIR._serialized_start=2223
  _PROJECTSORTDIR._serialized_end=2326
  _PROJECTASSET._serialized_start=45
  _PROJECTASSET._serialized_end=283
  _PROJECT._serialized_start=286
  _PROJECT._serialized_end=628
  _CREATEPROJECTREQUEST._serialized_start=631
  _CREATEPROJECTREQUEST._serialized_end=873
  _UPDATEPROJECTREQUEST._serialized_start=876
  _UPDATEPROJECTREQUEST._serialized_end=1181
  _LISTPROJECTREQUEST._serialized_start=1183
  _LISTPROJECTREQUEST._serialized_end=1248
  _GETPROJECTREQUEST._serialized_start=1250
  _GETPROJECTREQUEST._serialized_end=1330
  _DELETEPROJECTREQUEST._serialized_start=1332
  _DELETEPROJECTREQUEST._serialized_end=1415
  _QUERYASSETSREQUEST._serialized_start=1418
  _QUERYASSETSREQUEST._serialized_end=1754
  _QUERYASSETSRESPONSE._serialized_start=1756
  _QUERYASSETSRESPONSE._serialized_end=1869
  _PROJECTSERVICE._serialized_start=2329
  _PROJECTSERVICE._serialized_end=2718
# @@protoc_insertion_point(module_scope)
