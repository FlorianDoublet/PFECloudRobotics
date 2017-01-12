// Generated at Thu Jan 12 14:53:32 CET 2017 from platform:/resource/turtlebot/model/turtlebot.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'turtlebot'
//
// ======================================================================

module turtlebot

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core

// ======================================================================
//
// OCCI extension 'turtlebot'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "turtlebot"
    scheme = "http://occiware.org/turtlebot#"
    import = core/extension
    kinds = turtlebot
    no mixins
    no types
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/turtlebot#turtlebot'
//
// ======================================================================

one sig turtlebot extends Kind {} {
    term = "turtlebot"
    scheme = "http://occiware.org/turtlebot#"
    no title
    parent = core/resource
    attributes = turtlebot_duration + turtlebot_user + turtlebot_ip_address + turtlebot_password
    actions = turtlebot_move_forward + turtlebot_move_backward + turtlebot_turn_left + turtlebot_turn_right + turtlebot_stop
    entities in Turtlebot
}

//
// OCCI attribute 'duration'
//
one sig turtlebot_duration extends Attribute {} {
    name = "duration"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "1000"
    description = "Duration of a moving commande (forward or backward)"
    multiple_values = False
}

//
// OCCI attribute 'user'
//
one sig turtlebot_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'ip_address'
//
one sig turtlebot_ip_address extends Attribute {} {
    name = "ip_address"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'password'
//
one sig turtlebot_password extends Attribute {} {
    name = "password"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/turtlebot/turtlebot/action#move_forward'
//
one sig turtlebot_move_forward extends Action {} {
    term = "move_forward"
    scheme = "http://occiware.org/turtlebot/turtlebot/action#"
    title = "The turtlebot move forward"
    no attributes
}


//
// OCCI action 'http://occiware.org/turtlebot/turtlebot/action#move_backward'
//
one sig turtlebot_move_backward extends Action {} {
    term = "move_backward"
    scheme = "http://occiware.org/turtlebot/turtlebot/action#"
    title = "The turtlebot move backward"
    no attributes
}


//
// OCCI action 'http://occiware.org/turtlebot/turtlebot/action#turn_left'
//
one sig turtlebot_turn_left extends Action {} {
    term = "turn_left"
    scheme = "http://occiware.org/turtlebot/turtlebot/action#"
    title = "The turtlebot turn left"
    no attributes
}


//
// OCCI action 'http://occiware.org/turtlebot/turtlebot/action#turn_right'
//
one sig turtlebot_turn_right extends Action {} {
    term = "turn_right"
    scheme = "http://occiware.org/turtlebot/turtlebot/action#"
    title = "The turtlebot turn right"
    no attributes
}


//
// OCCI action 'http://occiware.org/turtlebot/turtlebot/action#stop'
//
one sig turtlebot_stop extends Action {} {
    term = "stop"
    scheme = "http://occiware.org/turtlebot/turtlebot/action#"
    title = "Force the turtlebot to stop"
    no attributes
}


// ======================================================================
// Signature for Turtlebot
// ======================================================================

sig Turtlebot extends core/Resource {
    duration : lone core/Number,
    user : lone String,
    ip_address : lone String,
    password : lone String,
} {
    hasKind[turtlebot]
}

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

