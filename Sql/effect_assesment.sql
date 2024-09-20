create table if not exists effect_assesment(
assesment_type varchar(255) not null,
source_application varchar(255) null,
source_dataset varchar(255) null,
applicable_to_all_data varchar(255) null,
model_name varchar(255) null,
model_refrence_code varchar(255) null,
assesment_medium varchar(255) null,
max_allowed_failures Integer null,
follow_up_required varchar(255) null,
re_assesment_required varchar(255) null,
entity_state varchar(255) null,
constraint effect_assesment_pk primary key(assesment_type));