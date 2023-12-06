package com.company.jmixpm.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.UiMinimalRole;

@ResourceRole(name = "CombinedManagerRole", code = CombinedManagerRole.CODE, scope = "UI")
public interface CombinedManagerRole extends UiMinimalRole, ProjectManagementRole {
    String CODE = "combined-manager-role";
}